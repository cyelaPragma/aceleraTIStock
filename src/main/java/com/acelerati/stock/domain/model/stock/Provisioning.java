package com.acelerati.stock.domain.model.stock;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
public class Provisioning {
    private Long id;
    private Stock stock;
    private Date sourcingDate;
    private int idUser;
}

