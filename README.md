# SDP-Homework-1

## Description

This project is a simple Spring Boot application that provides an API for managing products.

## Features

- Get a list of products with pagination support.

## Setup and Installation

1. Clone the repository:

```bash
git clone https://github.com/yourusername/SDP-Homework-1.git
```

2. Navigate to the project directory:

```bash
cd SDP-Homework-1
`````

3. Build the project using Gradle:

```bash
./gradlew build
````

4. Run the application:

```bash
./gradlew bootRun
````

## Usage

The application provides the following endpoints:

- `GET /api`: Returns a greeting message.
- `GET /pagedApi?page={page}&numberOfProducts={numberOfProducts}`: Returns a list of products based on the provided page number and number of products per page.

## Testing

The project contains unit tests for the `Product` class and the `ApiController` class. You can run the tests using the following command:

```bash
./gradlew test
````

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License

[MIT](https://choosealicense.com/licenses/mit/)