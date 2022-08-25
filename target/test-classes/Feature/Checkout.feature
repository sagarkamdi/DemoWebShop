#Author: your.email@your.domain.com
Feature: Verify Checkout feature
@Checkout_tag
  Scenario Outline: Verify Checkout
    Given Open browser login and add2cart
    When go to cart and checkout
    Then add payment info
