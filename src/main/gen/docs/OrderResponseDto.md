

# OrderResponseDto

Response on successfully added or updated order

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The unique identifier for the order |  |
|**userId** | **UUID** |  |  |
|**status** | **OrderStatus** |  |  |
|**items** | [**List&lt;OrderItemResponseDto&gt;**](OrderItemResponseDto.md) |  |  |
|**itemsQuantity** | **Integer** | Quantity of all product items |  |
|**itemsTotalPrice** | **BigDecimal** | Total price of all product items |  |
|**deliveryCost** | **BigDecimal** |  |  |
|**taxCost** | **BigDecimal** |  |  |
|**totalOrderCost** | **BigDecimal** | totalProductsCost + deliveryCost + taxCost |  |
|**deliveryInfo** | **String** | Order details, submitted to DB on the checkout stage |  |
|**recipientName** | **String** | May be different from the user&#39;s name |  |
|**recipientSurname** | **String** | May be different from the user&#39;s surname |  |
|**email** | **String** | May be different from the user&#39;s email |  |
|**phoneNumber** | **String** | May be different from the user&#39;s phone |  |
|**createdAt** | **OffsetDateTime** |  |  |



