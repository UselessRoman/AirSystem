package com.wjc.service.impl;

import com.wjc.service.TicketService;
import com.wjc.domain.Ticket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {
    @Override
    public List<Ticket> findByPriceLessThan() {
        return null;
    }
}
