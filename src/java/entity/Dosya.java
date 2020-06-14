/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author brkna
 */
public class Dosya {
    private Long id;
    private String dosyaİsim;
    private String dosyaYolu;
    private String dosyaUzanti;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDosyaİsim() {
        return dosyaİsim;
    }

    public void setDosyaİsim(String dosyaİsim) {
        this.dosyaİsim = dosyaİsim;
    }

    public String getDosyaYolu() {
        return dosyaYolu;
    }

    public void setDosyaYolu(String dosyaYolu) {
        this.dosyaYolu = dosyaYolu;
    }

    public String getDosyaUzanti() {
        return dosyaUzanti;
    }

    public void setDosyaUzanti(String dosyaUzanti) {
        this.dosyaUzanti = dosyaUzanti;
    }
    
    
}
