package com.backend.backend.users.domain;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

public enum TipoUsuario implements GrantedAuthority {
    CLIENTE,
    COMERCIANTE;

    public GrantedAuthority asAuthority() {
        return new SimpleGrantedAuthority(getAuthority());
    }

    public String getRoleName() {
        return getAuthority();
    }

    @Override
    public String getAuthority() {
        return "ROLE_" + name();
    }
}
