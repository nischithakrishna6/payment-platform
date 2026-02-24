#         NexaVault - Modern Fintech Banking Platform

<div align="center">

**A full-stack fintech application for seamless account management, transfers, and expense tracking**

[![Live Demo](https://img.shields.io/badge/demo-online-success?style=for-the-badge&logo=vercel)](https://nexavault-frontend.onrender.com)
[![GitHub](https://img.shields.io/badge/github-repository-blue?style=for-the-badge&logo=github)](https://github.com/nischithakrishna6/payment-platform)

</div>

---

##  Table of Contents

- [About The Project](#about-the-project)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Screenshots](#screenshots)
- [Getting Started](#getting-started)
- [Installation](#installation)
- [Usage](#usage)
- [API Documentation](#api-documentation)
- [Docker Deployment](#docker-deployment)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)
- [Acknowledgments](#acknowledgments)

---

##  About The Project

NexaVault is a modern, full-stack fintech banking platform that provides users with comprehensive financial management tools. Built with cutting-edge technologies, it offers secure account linking, seamless fund transfers, and intelligent expense tracking with visual analytics.

### Why NexaVault?

-  **Bank-Grade Security** - JWT authentication with encrypted data transmission
-  **Lightning Fast** - Optimized performance with lazy loading and caching
-  **Responsive Design** - Seamless experience across all devices
-  **Smart Analytics** - Visual insights into spending patterns
-  **Modern UI/UX** - Glassmorphism design with smooth animations
-  **Cloud Native** - Containerized and deployed on modern cloud infrastructure

---

##  Features

###  Authentication & Security
- JWT-based authentication system
- Secure password encryption (BCrypt)
- OTP-based password reset via email
- Session management with auto-logout

###  Account Management
- Link multiple bank accounts
- Real-time IFSC code validation
- Account verification system
- Support for Savings, Current, and Business accounts
- ATM-style card visualization

###  Fund Transfers
- Instant transfers between linked accounts
- Transaction history with filters
- Transfer confirmation system
- Real-time balance updates

###  Expense Tracking
- Category-based expense management
- Interactive charts (Pie & Line charts)
- Daily/Weekly/Monthly analytics
- 10+ expense categories with custom icons
- Export capabilities

###  User Interface
- Glassmorphism design aesthetic
- Responsive layout (mobile, tablet, desktop)
- Dark-themed components
- Smooth animations and transitions
- ATM card-style account display with stacking/grid views

---

##  Tech Stack

### Frontend
![Angular](https://img.shields.io/badge/Angular-DD0031?style=for-the-badge&logo=angular&logoColor=white)
![TypeScript](https://img.shields.io/badge/TypeScript-007ACC?style=for-the-badge&logo=typescript&logoColor=white)
![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white)
![Chart.js](https://img.shields.io/badge/Chart.js-FF6384?style=for-the-badge&logo=chartdotjs&logoColor=white)

- **Angular 19** - Progressive web framework
- **TypeScript** - Typed JavaScript
- **RxJS** - Reactive programming
- **Chart.js** - Data visualization
- **Angular Router** - Client-side routing
- **Reactive Forms** - Form handling

### Backend
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-000000?style=for-the-badge&logo=jsonwebtokens&logoColor=white)

- **Spring Boot 3.4.1** - Java framework
- **Spring Security** - Authentication & authorization
- **Spring Data JPA** - Data persistence
- **PostgreSQL** - Relational database
- **Hibernate** - ORM framework
- **JWT** - Secure token-based authentication
- **JavaMailSender** - Email service
- **Lombok** - Boilerplate code reduction

### DevOps & Deployment
![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)
![Render](https://img.shields.io/badge/Render-46E3B7?style=for-the-badge&logo=render&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)

- **Docker** - Containerization
- **Docker Compose** - Multi-container orchestration
- **Render** - Cloud platform
- **Nginx** - Web server (frontend)
- **Maven** - Build automation
- **Git** - Version control

---

## 🚀 Getting Started

### Prerequisites

Ensure you have the following installed:

- **Node.js** (v20 or higher)
- **Java JDK** (v21 or higher)
- **PostgreSQL** (v16 or higher)
- **Docker** (optional, for containerized deployment)
- **Git**
```bash

## 📦 Installation

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/nischithakrishna6/payment-platform.git
cd payment-platform
```

### 2️⃣ Backend Setup
```bash
cd backend

# Configure database
# Edit src/main/resources/application.properties
# Update database credentials

# Run backend
./mvnw spring-boot:run

# Backend will run on http://localhost:8081
```

### 3️⃣ Frontend Setup
```bash
cd frontend

# Install dependencies
npm install

# Start development server
ng serve

# Frontend will run on http://localhost:4200
```

### 4️⃣ Database Setup
```sql
-- Create database
CREATE DATABASE fintechdb;

-- Tables will be auto-created by Hibernate on first run
```

---

## 🐳 Docker Deployment

### Quick Start with Docker Compose
```bash
# Build and run all services
docker-compose up --build

# Run in detached mode
docker-compose up -d

# View logs
docker-compose logs -f

# Stop services
docker-compose down
```

### Services

- **Frontend**: http://localhost
- **Backend**: http://localhost:8081
- **PostgreSQL**: localhost:5432

---

## 💻 Usage

### 1️⃣ Register Account

1. Navigate to the registration page
2. Fill in email, password, and personal details
3. Submit to create account

### 2️⃣ Link Bank Account

1. Login with credentials
2. Click "Add Account"
3. Select your bank
4. Enter IFSC code and verify
5. Enter account details
6. Demo balance (₹5,000 - ₹50,000) will be assigned

### 3️⃣ Transfer Funds

1. Navigate to "Transfer Money"
2. Select source and destination accounts
3. Enter amount and description
4. Confirm transfer

### 4️⃣ Track Expenses

1. Go to "Track Expenses"
2. Add expenses with category, amount, and date
3. View analytics (daily/weekly/monthly)
4. Visualize spending patterns

---

## 📚 API Documentation

### Base URL
```
Production: https://nexavault-backend.onrender.com/api
Local: http://localhost:8081/api
```

### Authentication Endpoints

#### Register User
```http
POST /api/auth/register
Content-Type: application/json

{
  "email": "user@example.com",
  "password": "SecurePass123!",
  "firstName": "John",
  "lastName": "Doe",
  "phone": "9876543210"
}
```

#### Login
```http
POST /api/auth/login
Content-Type: application/json

{
  "email": "user@example.com",
  "password": "SecurePass123!"
}

Response:
{
  "success": true,
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...",
  "data": {
    "userId": 1,
    "email": "user@example.com",
    "firstName": "John",
    "lastName": "Doe"
  }
}
```

### Account Endpoints

#### Get All Accounts
```http
GET /api/accounts
Authorization: Bearer 
```

#### Link New Account
```http
POST /api/accounts/link
Authorization: Bearer 
Content-Type: application/json

{
  "accountType": "SAVINGS",
  "bankName": "State Bank of India",
  "bankCode": "SBIN",
  "branchName": "Main Branch",
  "ifscCode": "SBIN0001234",
  "accountHolderName": "John Doe",
  "existingAccountNumber": "12345678901234"
}
```

### Transaction Endpoints

#### Create Transfer
```http
POST /api/transactions/transfer
Authorization: Bearer 
Content-Type: application/json

{
  "fromAccountId": 1,
  "toAccountId": 2,
  "amount": 1000,
  "description": "Payment for services"
}
```

#### Get Transactions
```http
GET /api/transactions
Authorization: Bearer 
```

### Expense Endpoints

#### Add Expense
```http
POST /api/expenses
Authorization: Bearer 
Content-Type: application/json

{
  "category": "Food & Dining",
  "amount": 500,
  "description": "Lunch at restaurant",
  "date": "2026-02-24"
}
```

#### Get Expense Stats
```http
GET /api/expenses/stats?period=monthly
Authorization: Bearer 
```

---

## 📁 Project Structure
```
payment-platform/
├── backend/                      # Spring Boot backend
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/fintech/platform/
│   │   │   │       ├── config/           # Configuration classes
│   │   │   │       ├── controller/       # REST controllers
│   │   │   │       ├── dto/              # Data Transfer Objects
│   │   │   │       ├── model/            # JPA entities
│   │   │   │       ├── repository/       # Data repositories
│   │   │   │       ├── security/         # Security components
│   │   │   │       └── service/          # Business logic
│   │   │   └── resources/
│   │   │       ├── application.properties
│   │   │       └── application-prod.properties
│   │   └── test/                         # Unit tests
│   ├── Dockerfile
│   └── pom.xml
│
├── frontend/                     # Angular frontend
│   ├── src/
│   │   ├── app/
│   │   │   ├── components/       # UI components
│   │   │   ├── services/         # API services
│   │   │   ├── models/           # TypeScript interfaces
│   │   │   ├── guards/           # Route guards
│   │   │   └── interceptors/     # HTTP interceptors
│   │   ├── environments/         # Environment configs
│   │   └── styles.css            # Global styles
│   ├── Dockerfile
│   ├── nginx.conf
│   ├── angular.json
│   └── package.json
│
├── docker-compose.yml            # Multi-container orchestration
├── render.yaml                   # Render deployment config
└── README.md                     # This file
```

---

## 🌟 Key Features Explained

### JWT Authentication Flow
```
User Login → Credentials Validation → JWT Token Generation → 
Token Storage → Authenticated Requests → Token Verification → 
Access Granted
```

### Transfer Process
```
Select Accounts → Validate Balance → Create Transaction → 
Update Balances → Record History → Send Confirmation
```

### Expense Analytics
```
Add Expense → Categorize → Store Data → 
Generate Stats → Visualize Charts → Export Reports
```

---

## 🔒 Security Features

- **Password Encryption**: BCrypt hashing (strength 12)
- **JWT Tokens**: Secure, stateless authentication
- **CORS Configuration**: Controlled cross-origin requests
- **SQL Injection Prevention**: Parameterized queries via JPA
- **XSS Protection**: Input sanitization
- **CSRF Protection**: Disabled for stateless API
- **HTTPS**: Enforced in production (Render SSL)

---

## 🚦 Environment Variables

### Backend (.env or Render)
```env
SPRING_PROFILES_ACTIVE=prod
SPRING_DATASOURCE_URL=jdbc:postgresql://host:5432/fintechdb
SPRING_DATASOURCE_USERNAME=postgres
SPRING_DATASOURCE_PASSWORD=your_password
JWT_SECRET=your_jwt_secret_key_256_bits
SPRING_MAIL_USERNAME=your-email@gmail.com
SPRING_MAIL_PASSWORD=your_app_password
```

### Frontend (environment.prod.ts)
```typescript
export const environment = {
  production: true,
  apiUrl: 'https://nexavault-backend.onrender.com/api'
};
```

---

## 🧪 Testing

### Run Backend Tests
```bash
cd backend
./mvnw test
```

### Run Frontend Tests
```bash
cd frontend
npm run test
```

### Run E2E Tests
```bash
cd frontend
npm run e2e
```

---

## 🤝 Contributing

Contributions make the open-source community amazing! Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

---

## 📝 License

Distributed under the MIT License. See `LICENSE` for more information.

---

## 📧 Contact

**Nischitha Krishna**

- LinkedIn: [Your LinkedIn](https://linkedin.com/in/your-profile)
- Email: nischithakrishna6@gmail.com
- GitHub: [@nischithakrishna6](https://github.com/nischithakrishna6)
- Portfolio: [Your Portfolio](https://your-portfolio.com)

**Project Link**: [https://github.com/nischithakrishna6/payment-platform](https://github.com/nischithakrishna6/payment-platform)

**Live Demo**: [https://nexavault-frontend.onrender.com](https://nexavault-frontend.onrender.com)

---

## 🙏 Acknowledgments

* [Angular](https://angular.io/)
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Chart.js](https://www.chartjs.org/)
* [PostgreSQL](https://www.postgresql.org/)
* [Docker](https://www.docker.com/)
* [Render](https://render.com/)
* [Font Awesome](https://fontawesome.com/)
* [Google Fonts](https://fonts.google.com/)

---

## 🎯 Roadmap

- [x] User authentication & authorization
- [x] Multi-account management
- [x] Fund transfers
- [x] Expense tracking
- [x] Docker deployment
- [ ] Mobile app (React Native)
- [ ] Real-time notifications
- [ ] Credit card management
- [ ] Investment portfolio tracking
- [ ] Bill payment integration
- [ ] Multi-currency support
- [ ] AI-powered expense insights

---

## 📊 Project Stats

![GitHub repo size](https://img.shields.io/github/repo-size/nischithakrishna6/payment-platform)
![GitHub stars](https://img.shields.io/github/stars/nischithakrishna6/payment-platform?style=social)
![GitHub forks](https://img.shields.io/github/forks/nischithakrishna6/payment-platform?style=social)
![GitHub issues](https://img.shields.io/github/issues/nischithakrishna6/payment-platform)

---

<div align="center">

**⭐ Star this repo if you find it helpful!**

Made with ❤️ by [Nischitha Krishna](https://github.com/nischithakrishna6)

</div>

Next Steps:
1. Create the README
bashcd C:\Projects\payment-platform
notepad README.md
# Paste the content above
# Save and close
2. Add Screenshots
Take screenshots of your app and add them to the repo:
bash# Create images folder
mkdir images

# Add your screenshots to this folder
# Then update the README image links
3. Create LICENSE File
bashnotepad LICENSE
```

Paste MIT License:
```
MIT License

Copyright (c) 2026 Nischitha Krishna

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
4. Push Everything
bashgit add README.md LICENSE
git commit -m "Add comprehensive README and LICENSE"
git push origin main

Take Screenshots
Capture these views:

Login page
Dashboard with cards
Account cards (stacked view)
Transfer funds page
Expense tracker with charts
Transaction history

Save them as:

images/dashboard.png
images/accounts.png
images/expenses.png
etc.

Then update the README image links.

Your GitHub repo will now look SUPER PROFESSIONAL! 🚀✨ Sonnet 4.5
