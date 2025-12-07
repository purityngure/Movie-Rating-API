# Movie-Rating-API
A simple and clean Java Spring Boot REST API that allows users to:  - Add movies   - Rate movies (1–5 stars)   - Get the average rating of a movie   - List the most-rated movies  
🚀 Features

- ➕ Add new movies  
- ⭐ Rate movies (1–5)  
- 📊 View average movie rating  
- 🏆 List most rated movies  
- 🌱 Beginner-friendly Java REST API  

## 🧰 Requirements

- **Java 17+**
- **Maven**
- **VS Code / IntelliJ IDEA**
- **Spark Java** & **Gson** (via Maven)

## 📦 Setup

```bash
git clone https://github.com/your-username/movie-rating-api.git
cd movie-rating-api
mvn clean compile exec:java
```

Server runs at:

```
http://localhost:4567
```

## 🔗 API Endpoints

- **POST /movies** → Add a movie  
- **POST /movies/:id/rate** → Rate a movie  
- **GET /movies/:id/average** → Get average rating  
- **GET /movies/most-rated** → List most rated movies

❗ Common Issues & Fixes

| Error | Explanation | Solution |
|-------|-------------|----------|
| **Port 4567 already in use** | Spark default port busy | Stop previous instance or change port |
| **ClassNotFoundException / Gson missing** | Dependency missing | Ensure Maven installed & dependencies present |
| **Java version incompatible** | Running on older Java | Upgrade to Java 17+ |


## 📚 References

- [Java Docs](https://docs.oracle.com/javase/8/docs/api/)
- [Spark Java Docs](http://sparkjava.com/documentation)
- [Gson Docs](https://github.com/google/gson)
- [Maven Docs](https://maven.apache.org/guides/)


  👨‍💻 Author

Built by Purity Ngure 
Created as a learning project to explore Java REST APIs and in-memory data handling.
