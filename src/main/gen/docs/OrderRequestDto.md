

# OrderRequestDto

An order structure in the Iced-Latte system

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**items** | [**List&lt;OrderItemRequestDto&gt;**](OrderItemRequestDto.md) |  |  |
|**deliveryCost** | **BigDecimal** |  |  |
|**taxCost** | **BigDecimal** |  |  |
|**deliveryInfo** | **String** | Order details, submitted to DB on the checkout stage |  |
|**recipientName** | **String** | May be different from the user&#39;s name |  |
|**recipientSurname** | **String** | May be different from the user&#39;s surname |  |
|**email** | **String** | May be different from the user&#39;s email |  |
|**phoneNumber** | **String** | May be different from the user&#39;s phone |  |



