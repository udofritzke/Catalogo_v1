package com.example.catalogo_v1;

import java.util.Date;
import java.util.UUID;

public class Produto {
    private UUID mId;
    private String mDescrição;
    private Date mDataEntradaEstoque;
    private boolean mDisponível;
    private String mPreco;

    public Produto (){
        mId = UUID.randomUUID();
        mDataEntradaEstoque = new Date();
        mPreco = "0,00";
    }

    public UUID getId() {
        return mId;
    }

    public String getDescrição() {
        return mDescrição;
    }

    public void setDescrição(String descrição) {
        mDescrição = descrição;
    }

    public Date getDataEntradaEstoque() {
        return mDataEntradaEstoque;
    }

    public void setDataEntradaEstoque(Date dataEntradaEstoque) {
        mDataEntradaEstoque = dataEntradaEstoque;
    }

    public boolean isDisponível() {
        return mDisponível;
    }

    public void setDisponível(boolean disponível) {
        mDisponível = disponível;
    }

    public String getPreco() {
        return mPreco;
    }

    public void setPreco(String preco) {
        mPreco = preco;
    }
}
