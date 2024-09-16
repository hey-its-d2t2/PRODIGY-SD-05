# 🛍️ Product Scraper

A web scraper built using **Java Spring Boot**, **Jsoup**, **Thymeleaf**, and **jQuery** to extract product details like **Name**, **Price**, and **Rating** from various e-commerce websites. This tool also allows users to download the scraped data as a **CSV** file for easy analysis. 📊

## 📑 Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Screenshots](#screenshots)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## 🌟 Overview

This project is part of my internship at **Prodigy**, where I was tasked with building a product scraping tool to extract data from e-commerce websites. The application allows users to enter the URL of a product page, scrape the data, display the products in a table, and download the results as a CSV file. 🧰

## ✨ Features

- 🛒 Extract product details (Name, Price, Rating) from e-commerce websites.
- 📝 Input validation for website URLs.
- 🎨 Beautiful, responsive UI using Bootstrap and custom styling.
- ⬇️ Download scraped product data as CSV.
- 🚀 Easy-to-use interface with clear instructions.
- 🔐 Error handling for invalid URLs or scraping failures.

## 🛠️ Tech Stack

- **Backend**: Java, Spring Boot
- **Frontend**: Thymeleaf, HTML, CSS, Bootstrap, jQuery
- **Scraping**: Jsoup (Java HTML parser)
- **Database**: None (data scraped on demand and not stored)
- **Tools**: Maven for dependency management

## 🛠️ Installation

1. **Clone the repository**: 
   ```bash
   git clone https://github.com/yourusername/product-scraper.git
   cd product-scraper
   ```
2. **Install the required dependencies:**
Ensure you have **Maven** installed, then run:
    ```bash
    mvn clean install
    ```
2. **Run the application:**
    ```bash
    mvn spring-boot:run
    ```
4. **Access the application**
    - Open your browser and navigate to **http://localhost:8080**.

## 💻 Usage
- Enter the URL of an e-commerce product page (e.g., Amazon, Flipkart).
- Click on the Scrape button.
- Scraped product data will be displayed in the table.
- You can download the product data by clicking on the Download CSV button.
## 🔗📚 Example URLs for Testing
  - Books :
      - http://books.toscrape.com
  - Amazon (for product data):
    - https://www.amazon.com/s?k=laptops
    - https://www.amazon.com/s?k=headphones
  - Flipkart (for product data):
    -  https://www.flipkart.com/search?q=mobiles
    -  https://www.flipkart.com/search?q=shoes
  - eBay (for product data):
    - https://www.ebay.com/sch/i.html?_nkw=cameras
    - https://www.ebay.com/sch/i.html?_nkw=watches
  - AliExpress (for product data):
    - https://www.aliexpress.com/wholesale?catId=0&SearchText=smartphone
    - https://www.aliexpress.com/wholesale?catId=0&SearchText=shoes
  - Walmart (for product data):
    - https://www.walmart.com/search/?query=tablets
    - https://www.walmart.com/search/?query=televisions
  - BestBuy (for product data):
    - https://www.bestbuy.com/site/searchpage.jsp?st=laptops
    - https://www.bestbuy.com/site/searchpage.jsp?st=gaming+consoles
  - Snapdeal (for product data):
    -  https://www.snapdeal.com/search?keyword=earphones
    -  https://www.snapdeal.com/search?keyword=shoes

## 🛠️ API Endpoints

-  The following endpoints are available in this application:
    - Scrape Products (POST /api/scrap/scrape)
    - Input: URL of the e-commerce page.
    - Response: JSON array of product details (name, price, rating).
    - Download CSV (POST /api/scrap/download)
    - Input: JSON array of product details.
    - Response: CSV file containing the scraped data.
## 📸 Screenshots
- ###  🏠 Home Page
  ![Product Scraper - 1](https://github.com/user-attachments/assets/09976a1f-c1a0-45a4-b0e5-98fea014c167)

- ### 📊 Scraped Data Table
  ![Product Scraper](https://github.com/user-attachments/assets/42141f6e-c9ff-404a-ac4c-7d193f0e92bb)

- ### 📥 CSV Download
  ![csv](https://github.com/user-attachments/assets/a9da21d2-1490-420c-b854-2e760f18f5e1)

## 🤝 Contributing
Contributions are welcome! 🎉 If you'd like to improve this project, feel free to submit a pull request. Before contributing, please ensure your code adheres to the following guidelines:

- Code must be properly documented.
- Ensure backward compatibility with previous versions.
- Follow coding best practices for Java and Spring Boot.

## ⚖️  📞 Contact & Copyright
- Product Scraper is an open-source project You’re free to use, modify, and distribute it.
- © 2024 Deepak Singh | deepsinghkumar01@gmail.com
