package com.wjc.service;

import com.wjc.domain.Ticket;

import java.util.List;

public interface TicketService
{
    List<Ticket> findByPriceLessThan();
}
