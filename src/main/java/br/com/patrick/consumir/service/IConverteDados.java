package br.com.patrick.consumir.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
