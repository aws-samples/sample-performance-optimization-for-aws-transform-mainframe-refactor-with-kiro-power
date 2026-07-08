# CardDemo Angular Web Application

This project is the Angular frontend for the CardDemo credit card management system, modernized from AS/400 using AWS Transform for Mainframe Refactor. It is powered by [Angular](https://github.com/angular/angular-cli) version 18.2.12.

## Prerequisites

- Node.js 18.20.5+
- npm 10.8.2+
- Angular CLI 18.2.12 (`npm install -g @angular/cli@18.2.12`)

## Setup

After cloning the repository, install project dependencies:

```bash
npm install
```

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.
For dev environment, update target url in proxy.conf.json.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `-prod` flag for a production build.
For production, update gapwalk-application url in config.json.

Verify the build succeeded by checking for the `dist/` directory and reviewing console output for errors.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

Tests pass when you see "SUCCESS" in the console output.

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/).
Before running the tests make sure you are serving the app via `ng serve`.

Verify all test specs pass without failures in the terminal output.

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI README](https://github.com/angular/angular-cli/blob/master/README.md).
