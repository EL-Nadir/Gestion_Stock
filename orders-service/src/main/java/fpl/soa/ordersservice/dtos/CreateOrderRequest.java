package fpl.soa.ordersservice.dtos;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.UUID;

@Data @NoArgsConstructor
@AllArgsConstructor
public class CreateOrderRequest {
    @NotNull
    private String customerId;
    @NotNull
    private String productId;
    @NotNull
    @Positive
    private Integer productQuantity;
}
