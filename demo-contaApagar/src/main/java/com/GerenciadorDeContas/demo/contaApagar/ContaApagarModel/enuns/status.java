package com.GerenciadorDeContas.demo.contaApagar.ContaApagarModel.enuns;

public enum status {
    AGUARDANDO,
    PAGO,
    VENCIDA;

    public status getAguardando() {
        return AGUARDANDO;
    }

    public status getPago() {
        return PAGO;
    }

    public status getVencida() {
        return VENCIDA;
    }
}
