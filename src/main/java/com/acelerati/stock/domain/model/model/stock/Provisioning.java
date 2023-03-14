package com.acelerati.stock.domain.model.model.stock;


import com.acelerati.stock.domain.model.model.user.User;
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
    private int amount;
    private Date sourcingDate;
    private Double providerPrice;
    private User employee;
    private User user;
}
