## Library Management System

This repository contains both the backend (Spring Boot) and frontend (React) for the Library Management System.

### Backend (Spring Boot)
1. Navigate to the 'backend' folder:
   cd backend
   
2. Run the backend:
	mvn spring-boot:run

###Frontend (React)

1. Navigate to the frontend folder
	cd frontend

2. Install dependencies:
	npm install

3. Start the frontend:
	npm start



---

### **Advantages of Keeping Frontend and Backend in One Repository**
1. **Simplified Version Control**: Easier to track changes across both frontend and backend.
2. **Synchronized Changes**: Frontend and backend changes are part of the same commit, ensuring compatibility.
3. **Easier Collaboration**: Developers can clone one repository to access the entire project.

---

### **Disadvantages**
1. **Repository Size**: The repository might grow large if both frontend and backend generate build artifacts.
2. **Deployment Complexity**: If you deploy the frontend and backend separately, consider whether a monorepo fits your workflow.

---

### **Final Notes**
After organizing and committing the project:
1. Verify on GitHub that the changes are reflected.
2. Test both the frontend and backend locally to ensure nothing is broken.

Let me know if you encounter any issues or need further clarification! 😊




