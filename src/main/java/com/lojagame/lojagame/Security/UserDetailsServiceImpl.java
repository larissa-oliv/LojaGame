package com.lojagame.lojagame.Security;

import com.lojagame.lojagame.Model.*;
import com.lojagame.lojagame.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UsuarioRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<Usuario> usuario = userRepository.findByUsuario(userName);
        usuario.orElseThrow(() -> new UsernameNotFoundException(userName + " not found."));
        return usuario.map(UserDetailsImpl::new).get();
    }

}
