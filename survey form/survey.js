const form = document.getElementById('survey-form');
const popup = document.getElementById('popup');
const closePopup = document.getElementById('close-popup');

const submitButton = document.getElementById('submit-btn');
const resetButton = document.getElementById('reset-btn');

submitButton.addEventListener('click', () => {
    // Handle form submission and validation
    // Display data in the popup
    // Show the popup
});

resetButton.addEventListener('click', () => {
    form.reset();
});

closePopup.addEventListener('click', () => {
    popup.style.display = 'none';
    form.reset();
});