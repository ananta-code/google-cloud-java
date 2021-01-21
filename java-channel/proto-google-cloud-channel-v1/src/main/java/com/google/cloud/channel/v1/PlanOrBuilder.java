/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/channel/v1/offers.proto

package com.google.cloud.channel.v1;

public interface PlanOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.Plan)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Describes how a reseller will be billed.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.PaymentPlan payment_plan = 1;</code>
   *
   * @return The enum numeric value on the wire for paymentPlan.
   */
  int getPaymentPlanValue();
  /**
   *
   *
   * <pre>
   * Describes how a reseller will be billed.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.PaymentPlan payment_plan = 1;</code>
   *
   * @return The paymentPlan.
   */
  com.google.cloud.channel.v1.PaymentPlan getPaymentPlan();

  /**
   *
   *
   * <pre>
   * Specifies when the payment needs to happen.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.PaymentType payment_type = 2;</code>
   *
   * @return The enum numeric value on the wire for paymentType.
   */
  int getPaymentTypeValue();
  /**
   *
   *
   * <pre>
   * Specifies when the payment needs to happen.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.PaymentType payment_type = 2;</code>
   *
   * @return The paymentType.
   */
  com.google.cloud.channel.v1.PaymentType getPaymentType();

  /**
   *
   *
   * <pre>
   * Describes how frequently the reseller will be billed, such as
   * once per month.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Period payment_cycle = 3;</code>
   *
   * @return Whether the paymentCycle field is set.
   */
  boolean hasPaymentCycle();
  /**
   *
   *
   * <pre>
   * Describes how frequently the reseller will be billed, such as
   * once per month.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Period payment_cycle = 3;</code>
   *
   * @return The paymentCycle.
   */
  com.google.cloud.channel.v1.Period getPaymentCycle();
  /**
   *
   *
   * <pre>
   * Describes how frequently the reseller will be billed, such as
   * once per month.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Period payment_cycle = 3;</code>
   */
  com.google.cloud.channel.v1.PeriodOrBuilder getPaymentCycleOrBuilder();

  /**
   *
   *
   * <pre>
   * Present for Offers with a trial period.
   * For trial-only Offers, a paid service needs to start before the trial
   * period ends for continued service.
   * For Regular Offers with a trial period, the regular pricing goes into
   * effect when trial period ends, or if paid service is started before the end
   * of the trial period.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Period trial_period = 4;</code>
   *
   * @return Whether the trialPeriod field is set.
   */
  boolean hasTrialPeriod();
  /**
   *
   *
   * <pre>
   * Present for Offers with a trial period.
   * For trial-only Offers, a paid service needs to start before the trial
   * period ends for continued service.
   * For Regular Offers with a trial period, the regular pricing goes into
   * effect when trial period ends, or if paid service is started before the end
   * of the trial period.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Period trial_period = 4;</code>
   *
   * @return The trialPeriod.
   */
  com.google.cloud.channel.v1.Period getTrialPeriod();
  /**
   *
   *
   * <pre>
   * Present for Offers with a trial period.
   * For trial-only Offers, a paid service needs to start before the trial
   * period ends for continued service.
   * For Regular Offers with a trial period, the regular pricing goes into
   * effect when trial period ends, or if paid service is started before the end
   * of the trial period.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Period trial_period = 4;</code>
   */
  com.google.cloud.channel.v1.PeriodOrBuilder getTrialPeriodOrBuilder();
}
