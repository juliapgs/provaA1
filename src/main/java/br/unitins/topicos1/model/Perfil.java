package br.unitins.topicos1.model;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Perfil {
    USER(1, "Usuario"),
    ADMIM(2, "Adm");

    private final Integer id;
    private final String label;
    
    Perfil(Integer id, String label) {
        this.id = id;
        this.label = label;
    }
    public Integer getId() {
        return id;
    }
    public String getLabel() {
        return label;
    }
    
    public static Perfil ValueOf(Integer id) throws IllegalArgumentException{
        if(id == null)
            return null;

        for(Perfil perfil : Perfil.values()){
            if(perfil.getId().equals(id))
                return perfil;
        }
        throw new IllegalArgumentException("id invalido" + id);
    }
    
}