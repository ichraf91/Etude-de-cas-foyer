package com.example.foyer14.Services;

import com.example.foyer14.Entities.Universite;

public interface Iuniversite {
    public Universite affecterFoyerAUniversite (long idFoyer, long idUniversite);
    public void desaffecterFoyerAUniversite (long idFoyer, long idUniversite);

}
