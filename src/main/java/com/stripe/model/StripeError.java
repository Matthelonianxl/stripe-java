package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class StripeError extends StripeObject {
  /** For card errors, the ID of the failed charge. */
  @SerializedName("charge")
  String charge;

  /**
   * For some errors that could be handled programmatically, a short string indicating the [error
   * code](/docs/error-codes) reported.
   */
  @SerializedName("code")
  String code;

  /**
   * For card errors resulting from a card issuer decline, a short string indicating the [card
   * issuer's reason for the decline](/docs/declines#issuer-declines) if they provide one.
   */
  @SerializedName("decline_code")
  String declineCode;

  /** A URL to more information about the [error code](/docs/error-codes) reported. */
  @SerializedName("doc_url")
  String docUrl;

  /**
   * A human-readable message providing more details about the error. For card errors, these
   * messages can be shown to your users.
   */
  @SerializedName("message")
  String message;

  /**
   * If the error is parameter-specific, the parameter related to the error. For example, you can
   * use this to display a message near the correct form field.
   */
  @SerializedName("param")
  String param;

  /**
   * The PaymentIntent object for errors returned on a request involving a PaymentIntent.
   */
  @SerializedName("payment_intent")
  PaymentIntent paymentIntent;

  /**
   * The PaymentMethod object for errors returned on a request involving a PaymentMethod.
   */
  @SerializedName("payment_method")
  PaymentMethod paymentMethod;

  /**
   * The source object for errors returned on a request involving a source.
   */
  @SerializedName("source")
  ExternalAccount source;

  /**
   * The type of error returned. One of `api_connection_error`, `api_error`, `authentication_error`,
   * `card_error`, `idempotency_error`, `invalid_request_error`, or `rate_limit_error`
   */
  @SerializedName("type")
  String type;
}
