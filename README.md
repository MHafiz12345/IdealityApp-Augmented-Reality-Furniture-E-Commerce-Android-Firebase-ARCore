# 🏠 IdealityApp

> **"Construct your ideal reality"** – IdealityApp is an AR-enhanced e-commerce app for furniture and interior previews, bridging the gap between online catalogs and the real world.

![image](https://github.com/user-attachments/assets/cb829968-e32d-4a71-831b-0132303ba437)
![image](https://github.com/user-attachments/assets/b9e3f45f-0e58-4289-b278-19d6f352b7a9)



## 📱 Introduction

Online furniture shopping often lacks the confidence that comes from seeing items in person. Customers might worry if a sofa will fit in their living room or if a lamp matches their decor. **IdealityApp** addresses this problem by combining a traditional furniture shopping experience with augmented reality (AR) previews.

The app enables users to visualize true-to-scale 3D models of furniture in their own space before making a purchase decision. By integrating AR into the browsing and buying process, IdealityApp reduces guesswork and helps users make informed, satisfying choices when furnishing their homes.

## ✨ Features

### 🔐 User Authentication
- Secure email/password signup and login with Firebase
- Email verification to confirm accounts
- Phone number verification (OTP) for added security

### 🛋️ Product Catalog & Browsing
- Browse a wide range of furniture products by category
- Detailed product pages with images, descriptions, dimensions, and prices

### 🔮 Augmented Reality Preview
- Experience products in AR using Google ARCore
- Place life-sized 3D models of furniture in your space through your device's camera
- See how items look and fit in your actual environment

### ❤️ Wishlist
- Save favorite items to a wishlist for easy access later
- Like products and view saved items anytime

### 🛒 Shopping Cart & Checkout
- Add products to a cart and simulate checkout or order placement
- Maintain cart state and guide users through confirming orders

### 📋 Order History
- Track past orders or transactions in a dedicated history section
- View detailed records including items purchased and date

### 👤 Profile Management
- Edit profile information (name, email, phone)
- Upload and update profile pictures using Appwrite cloud storage

### ⚡ Real-Time Data & Notifications
- Leverages Firebase's real-time capabilities for instant updates
- Always up-to-date catalog, cart, and user information

### 🎨 Polished UI & Animations
- Modern UI following Material Design guidelines
- Smooth navigation and visual feedback
- Custom animations for transitions and interactive elements

## 📱 App Overview

![image](https://github.com/user-attachments/assets/fa9aad3c-87c6-4ab4-9fbf-7ef8fc3a61b7)

This composite image provides an overview of the main screens and user flows in IdealityApp:
- Onboarding (Login & Signup)
- Home browsing page
- AR preview
- Product details
- Profile management sections

The diagram highlights how users navigate between major features: browsing categories, viewing product details, launching the AR viewer to preview products in their space, adding items to cart or wishlist, and accessing profile or order history.

## 🛠️ Technologies Used

IdealityApp is built with a modern Android tech stack and toolset:

### 💻 Core Technologies
- **Kotlin** – All app code is written in Kotlin
- **Android SDK & UI** – Using Android frameworks with Material Design components
- **Jetpack MVVM Architecture** – ViewModels, LiveData/Flow for clean separation of concerns

### ☁️ Backend Services
- **Firebase Backend**
  - Firebase Auth for email/password and phone login
  - Cloud Firestore or Realtime Database for product info, cart contents, and orders
- **Appwrite Cloud Storage** – For managing user uploads like profile images

### 🔮 AR Technology
- **ARCore (Google Augmented Reality)** – Enabling furniture preview feature
- Surface detection and 3D model placement in camera view

### 📚 Additional Libraries
- Image loading (Glide or Coil)
- RecyclerView and CardView for list displays
- Play Services plugins for Firebase and ARCore integration
- Material Design components and animations

## 🏗️ Architecture & Project Structure

The project follows MVVM (Model-View-ViewModel) architecture and clear separation of concerns:

### 📱 View Layer
- Activities & Fragments for UI screens
- AuthActivity for login/signup flows
- HomeActivity hosting fragments for different sections
- Custom UI components and adapters

### 🧠 ViewModel Layer
- Contains logic and state for each UI feature
- Communicates with data sources
- Holds LiveData/Flow objects that the UI observes

### 📊 Model & Data Management
- Data classes for entities like User, Product, Order, CartItem
- Repository layer for data operations
- Managers for auth, database, and storage operations

### 🧩 Key Components
- Navigation between activities and fragments
- AR module for furniture preview
- Adapters for RecyclerViews (product catalog, wishlist, etc.)
- Utility classes and helpers

## 🎨 Branding

IdealityApp's branding emphasizes a modern, clean aesthetic:

- App logo features "IDEALITY" with furniture silhouettes
- Tagline: "Construct your ideal reality"
- App icon shows a stylized room setting in an AR camera frame
- Neutral, sleek color scheme (black, white, and subtle accents)
- Consistent typography and Material Design components

## 🚀 Setup and Installation

To run the project locally or deploy it for development/testing:

### 1️⃣ Project Setup
```bash
# Clone the repository
git clone https://github.com/yourusername/ideality-app.git
cd ideality-app
```

### 2️⃣ Firebase Configuration
- Create a new Firebase project and enable Authentication
- Download `google-services.json` and place it in the `app/` folder
- Set up Cloud Firestore or Realtime Database with appropriate collections

### 3️⃣ Appwrite Setup (Optional)
- Set up an Appwrite project for profile image storage
- Configure the app with your Appwrite endpoint, project ID, and API key
- Create a storage bucket for profile pictures

### 4️⃣ Build Requirements
- Android Studio (latest version)
- Latest Android SDK and build tools
- Device or emulator with ARCore support

### 5️⃣ Running the App
- Open the project in Android Studio
- Connect an Android device or start an ARCore-supported emulator
- Build and run the app
- Create a new account or log in to test all features

## 📱 Feature Testing Checklist

- [ ] User authentication (signup, login, verification)
- [ ] Product browsing and category navigation
- [ ] AR preview of furniture items
- [ ] Add/remove items from wishlist
- [ ] Shopping cart and checkout flow
- [ ] Order history viewing
- [ ] Profile editing and image upload
- [ ] Authentication state persistence

## 🤝 Contributing

Contributions to IdealityApp are welcome! Please feel free to submit a Pull Request.

## 📄 License

This project is licensed under the [MIT License](LICENSE).
