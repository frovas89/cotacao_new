package br.com.frovas.mineradora.dto;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

@Jacksonized
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CurrencyPriceDTO {

	@JsonProperty("USDBRL")
	public USDBRL USDBRL;
}
