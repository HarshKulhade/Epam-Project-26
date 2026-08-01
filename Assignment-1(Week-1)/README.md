# EPAM Week-1 Assignment – Banking Application

## Project Description

This project is developed as part of the **EPAM Week-1 JavaScript Assignment**.

The project is a simple **Banking Application** that demonstrates the use of HTML and JavaScript to create an interactive webpage for bank customers.

The application allows a customer to enter a Customer ID, validate the Customer ID, and generate a coupon code for a valid customer.

## Features

* Displays a welcome message for the banking application.
* Shows instructions for getting a coupon code.
* Displays a welcome alert when the user hovers over the welcome message.
* Allows the user to hide the instructions using the **Register** button.
* Accepts a Customer ID from the user.
* Validates the entered Customer ID.
* Recognizes Customer IDs containing `SBIN` or `sbin` as valid.
* Displays appropriate alerts for valid and invalid customers.
* Generates a random coupon code for a validated customer.
* Restricts coupon generation using a coupon-generation counter.
* Displays the coupon validity date.

## Steps to Use the Application

1. Open `BankApplication.html` in a web browser.
2. Enter the Customer ID.
3. Click **Validate Customer**.
4. If the Customer ID is valid, an alert will confirm the validation.
5. Click **GetCoupon** to generate the coupon code.
6. The generated coupon code will be displayed on the webpage.

## Technologies Used

* **HTML**
* **JavaScript**

## Project Files

### `BankApplication.html`

Contains the structure and user interface of the Banking Application.

### `functions.js`

Contains the JavaScript functions used for:

* Hover alert
* Hiding the instruction steps
* Customer validation
* Coupon generation

## JavaScript Functions

### `alerter()`

Displays a welcome alert when the user hovers over the welcome message. The alert is displayed only once.

### `hideSteps()`

Hides the instructions displayed on the webpage.

### `validateCustomer()`

Validates the Customer ID entered by the user. A Customer ID containing `SBIN` or `sbin` is treated as a valid customer.

### `generateCoupon()`

Generates a random coupon code for a validated customer and displays it on the webpage.

## How to Run

1. Download the project files.
2. Keep `BankApplication.html` and `functions.js` in the same folder.
3. Open `BankApplication.html` using a web browser.
4. Enter a Customer ID and use the available buttons to interact with the application.

## Assignment Information

**Assignment:** Week-1 Assignment
**Project:** Banking Application
**Technology:** JavaScript
**Program:** EPAM Student Assignment 2026
