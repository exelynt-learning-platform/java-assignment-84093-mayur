function createTaskElement(taskText) {
    const task = document.createElement("li");
    task.textContent = taskText;
    return task;
}

export { createTaskElement };