package com.screematchmusic.screematchmusic.model;

public class Musicas {

    private String nome;
    private Artista artista;

    public Musicas() {

    }

    public Musicas(String nome, Artista artista) {
        this.nome = nome;
        this.artista = artista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
}
