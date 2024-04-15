const stripe = Stripe('pk_test_51P5xJwGpBlxkya8YDONYnZhKk0njJ5spRVDiuIDuAAvGdFFmZENy602JwDdcTwVU5MCzjG8pLDFAdgUBICF0GJ9H00omIS5RDE');
const paymentButton = document.querySelector('#paymentButton');

paymentButton.addEventListener('click', () => {
  stripe.redirectToCheckout({
    sessionId: sessionId
  })
});
