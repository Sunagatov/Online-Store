

# UserDto

A user profile in the Iced-Latte system

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The unique identifier for the user |  [optional] |
|**firstName** | **String** | The first name of the user. First name should have a length between 2 and 128 characters |  |
|**lastName** | **String** | The last name of the user. Last name should have a length between 2 and 128 characters |  |
|**birthDate** | **LocalDate** | The birth date of the user |  [optional] |
|**phoneNumber** | **String** | The phone number of the user |  [optional] |
|**stripeCustomerToken** | **String** | The Stripe customer token associated with the user |  [optional] |
|**email** | **String** | The email address of the user |  |
|**address** | [**AddressDto**](AddressDto.md) |  |  [optional] |
|**avatarLink** | **String** | The avatar url of the user |  [optional] |



