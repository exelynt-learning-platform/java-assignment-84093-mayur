const taskInput = document.getElementById("taskInput");
const addTaskBtn = document.getElementById("addTaskBtn");
const taskList = document.getElementById("taskList");

addTaskBtn.addEventListener("click", function () {
    const taskText = taskInput.value.trim();

    if (taskText === "") {
        return;
    }

    const task = document.createElement("li");
    task.textContent = taskText;

    taskList.appendChild(task);
    taskInput.value = "";
});
