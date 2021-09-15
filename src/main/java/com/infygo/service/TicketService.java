package com.infygo.service;

import com.infygo.rest.objs.TicketRequestBody;
import com.infygo.rest.objs.TicketResponse;

public interface TicketService {
	public TicketResponse bookTicket(TicketRequestBody request, String flightId, String userId);
}
