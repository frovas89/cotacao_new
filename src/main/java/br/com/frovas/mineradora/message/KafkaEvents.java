package br.com.frovas.mineradora.message;

import br.com.frovas.mineradora.dto.QuotationDTO;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class KafkaEvents {

    private final Logger LOG = LoggerFactory.getLogger(KafkaEvents.class);

    @Channel("quotation-channel")
    Emitter<QuotationDTO> quotationRequestEmitter;

    public void sendNewKafkaEvent(QuotationDTO quotation) {

        LOG.info("\n\n-- Enviando Cotação para Tópico Kafka --\n");
        quotationRequestEmitter.send(quotation).toCompletableFuture().join();
    }
}
