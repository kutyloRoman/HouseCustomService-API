package com.kutylo.lab_2.mappers;

public interface Mapper<M, D> {
    M convertToModel(D d);

    D convertToDto(M m);
}
