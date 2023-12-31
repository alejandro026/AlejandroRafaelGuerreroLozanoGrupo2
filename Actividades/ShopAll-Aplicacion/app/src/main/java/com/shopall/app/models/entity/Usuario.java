package com.shopall.app.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "TBL_Usuarios")
public class Usuario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    @Id
    @Column(name = "idUsuario", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;
    
    @Column(name = "Nombre", nullable = true, length = 100)
    private String nombre;
    
    @Column(name = "ApMaterno", nullable = true, length = 100)
    private String apMaterno;
    
    @Column(name = "ApPaterno", nullable = true, length = 100)
    private String apPaterno;
    
    @Column(name = "Correo", nullable = true, length = 45, unique = true)
    private String correo;
    
    @Column(name = "Direccion", nullable = true, length = 110)
    private String direccion;
    
    @Column(name = "NoTelefono", nullable = true, length = 45, unique = true)
    private String noTelefono;
    
    @Column(name = "Tipo_usuario", nullable = true, length = 45)
    private String tipoUsuario;
    
    @Column(name = "Password", nullable = true, length = 65)
    private String password;
    
    @Column(name = "Estatus", nullable = true)
    private Integer estatus;
}
