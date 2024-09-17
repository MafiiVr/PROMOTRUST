package pe.edu.upc.promotrust.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.promotrust.securities.JwtRequest;
import pe.edu.upc.promotrust.securities.JwtResponse;
import pe.edu.upc.promotrust.securities.JwtTokenUtil;
import pe.edu.upc.promotrust.serviceimplement.JwtUserDetailsService;
import pe.edu.upc.promotrust.serviceimplement.JwtUserDetailsService;


@RestController
@CrossOrigin
public class JwtAuthenticationController {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private JwtUserDetailsService userDetailsService;


    @PostMapping("/login")
    public ResponseEntity<JwtResponse> login(@RequestBody JwtRequest req) throws Exception {
        authenticate(req.getNombre(), req.getContrasenia());
        final UserDetails userDetails = userDetailsService.loadUserByUsername(req.getNombre());
        final String token = jwtTokenUtil.generateToken(userDetails);
        return ResponseEntity.ok(new JwtResponse(token));
    }

    private void authenticate(String nombre, String contrasenia) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(nombre, contrasenia));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }


    }
}