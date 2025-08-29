# 🌦 Weather App (Jetpack Compose)

This is a simple weather app built with **Android Jetpack Compose** following the **MVVM architecture**.  
The app retrieves weather data from the [OpenWeather API](http://openweathermap.org/current), displays the description and temperature, and allows users to save their favorite city for quick access.

---

## ✨ Features
- 🚀 **Splash Screen** → navigates to homepage
- 🔎 **Search Weather by City** → fetches real-time weather info (description, temperature, and icon)
- 📄 **Weather Detail Screen** → displays full weather information
- 💾 **Save Favorite City** → automatically prepopulates homepage field
- 🎨 Built with **Jetpack Compose** and Material 3
- ✅ Includes **unit tests** for `WeatherViewModel`

---

## 🏗️ Architecture
This project uses the **MVVM (Model-View-ViewModel)** pattern and follows **SOLID principles**:

- **Model** → Repository layer for API & local storage
- **ViewModel** → Holds UI state, communicates with repository
- **View (UI)** → Composable functions (Jetpack Compose)
- **Dependency Injection** → Hilt (or manual DI if applicable)

---

## ⚙️ Tech Stack
- **Kotlin**
- **Jetpack Compose**
- **Hilt (DI)**
- **Coroutines & Flow**
- **Retrofit** for API requests
- **JUnit + Mockito** for testing

---

## 📱 Screenshots
*(Add screenshots here if you can)*

---

## 🧪 Testing
Unit tests are written with `kotlinx.coroutines.test` and `Mockito`.  
Run tests with:

```bash
./gradlew test
