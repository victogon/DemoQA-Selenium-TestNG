# DemoQA Selenium TestNG Framework

Automated UI test suite for [DemoQA](https://demoqa.com), built with Selenium WebDriver, Java, and TestNG.

## About
Modular automation framework applying the **Page Object Model** pattern to separate test logic from UI interactions. Test coverage includes elements, forms, widgets, alerts, frames, windows, and a book store application.

## Tech Stack
- Java
- Selenium WebDriver
- TestNG

## Project Structure
```
src/
├── main/java/com/
│   ├── base/         # Base configuration and setup
│   ├── pages/        # Page Object classes
│   └── utilities/    # Helper methods
└── test/java/
    ├── base/         # BaseTest class
    └── tests/
        ├── alerts_frames_windows/
        ├── book_store_application/
        ├── elements/
        ├── forms/
        └── widgets/
```
