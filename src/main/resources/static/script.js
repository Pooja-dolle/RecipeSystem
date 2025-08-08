window.onload = function () {
    fetch("http://localhost:8888/api/recipes")
        .then(response => response.json())
        .then(data => {
            const list = document.getElementById("allRecipes");
            list.innerHTML = "";
            data.forEach(recipe => {
                const li = document.createElement("li");
                li.innerHTML = `<strong>${recipe.name}</strong><br>Ingredients: ${recipe.ingredients}<br>Instructions: ${recipe.instruction}`;
                list.appendChild(li);
            });
        });
};

function searchRecipe() {
    const name = document.getElementById("recipeName").value.trim();

    fetch(`http://localhost:8888/api/recipes/search?name=${encodeURIComponent(name)}`)
        .then(response => {
            if (!response.ok) throw new Error("Recipe not found");
            return response.json();
        })
        .then(data => {
            const result = document.getElementById("recipeResult");
            result.innerHTML = `
                <h3>Result:</h3>
                <p><strong>${data.name}</strong></p>
                <p>Ingredients: ${data.ingredients}</p>
                <p>Instructions: ${data.instruction}</p>
            `;
        })
        .catch(error => {
            document.getElementById("recipeResult").innerHTML = `<p style="color:red;">Recipe not found</p>`;
        });
}
