// add pageTitle
const pageTitle = 'My Shopping List';
const groceries = [{
  grocery: 'chicken'
},
{
  grocery: 'steak'
},
{
  grocery: 'lobster'
},
{
  grocery: 'shrimp'
},
{
  grocery: 'pasta'
},
{
  grocery: 'ribs'
},
{
  grocery: 'hotdogs'
},
{
  grocery: 'salt'
},
{
  grocery: 'pepper'
},
{
  grocery: 'corn'
},
]

// add groceries

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const title = document.getElementById('title');
  title.innerText = pageTitle;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  const groceryList = document.getElementById('groceries');

  groceries.forEach((r) => {
    const groceryContainer = document.createElement('list');
    groceryContainer.setAttribute('id', 'list')

    addGrocery(groceryContainer, r.grocery);

    groceryList.insertAdjacentElement('beforeend', groceryContainer);
  });

}

function addGrocery(parent, grocery) {
  const groceryList = document.createElement('li');
  const groceryItems = groceryList.innerText = grocery;

  parent.appendChild(groceryList);
}

/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {
  const grocery = document.querySelectorAll('li');
  grocery.forEach((r) => {
    r.setAttribute('class', 'completed');
  });

}

setPageTitle();

displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});
