package com.GerenciadorDeContas.demo.contaApagar.ContaApagarModel;

import com.GerenciadorDeContas.demo.contaApagar.ContaApagarModel.enuns.status;
import com.GerenciadorDeContas.demo.contaApagar.ContaApagarModel.enuns.tipo;
import com.sun.istack.NotNull;
import lombok.*;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "gerenciador")
public class ContaAPagarModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 10, nullable = false)
    private String nome;

    @Column(name = "status")
    @Enumerated(value = EnumType.STRING)
    private status status;

    @Column(length = 10, nullable = false)
    @Enumerated(value = EnumType .STRING)
    private tipo tipo;

    @Column(length = 10, nullable = false)
    private Double Valor;

    @Column(length = 10, nullable = false)
    private LocalDate dataDeVencimento;

    @Column(length = 10)
    private LocalDateTime dataDePagamento;

}