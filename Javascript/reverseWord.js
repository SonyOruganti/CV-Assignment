function reverseWordsInSentence(sentence)
 {
    // Split the sentence into words
    const words = sentence.split(' ');
  
    // Reverse each word and rejoin them
    const reversedWords = words.map(word => 
        {
      // Check if the word has punctuation and store it
      const punctuation = word.match(/[.,;!?]/);
      if (punctuation)
        {
        const reversed = word
          .slice(0, -punctuation[0].length)
          .split('')
          .reverse()
          .join('');
        return reversed + punctuation[0];
        }
        else 
         {
        return word.split('').reverse().join('');
         }
       });
  
// Join the reversed words back into a sentence
    const reversedSentence = reversedWords.join(' ');
  
    return reversedSentence;
  }
  
  const inputSentence = "This is a sunny day!";
  const reversed = reverseWordsInSentence(inputSentence);
  console.log(reversed);
  