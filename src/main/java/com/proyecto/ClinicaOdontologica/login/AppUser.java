package com.proyecto.ClinicaOdontologica.login;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;

@Entity
public class AppUser implements UserDetails {

    @Id
    @SequenceGenerator(name="appUser_sequence", sequenceName="appUser_sequence", allocationSize=1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="appUser_sequence")
    private Long id;
    private String nombre;
    private String username;
    private String email;
    private String Password;

    @Enumerated(EnumType.STRING)
    private AppUsuarioRoles appUsuarioRoles;

    public AppUser(String nombre, String username, String email, String password, AppUsuarioRoles appUsuarioRoles) {
        this.nombre = nombre;
        this.username = username;
        this.email = email;
        Password = password;
        this.appUsuarioRoles = appUsuarioRoles;
    }

    public AppUser() {
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority granteAuthority = new SimpleGrantedAuthority(appUsuarioRoles.name());
        return Collections.singletonList(granteAuthority);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public AppUsuarioRoles getAppUsuarioRoles() {
        return appUsuarioRoles;
    }

    public void setAppUsuarioRoles(AppUsuarioRoles appUsuarioRoles) {
        this.appUsuarioRoles = appUsuarioRoles;
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
