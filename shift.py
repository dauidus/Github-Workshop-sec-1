# function name: shift_cipher_encode
# inputs: string - string to encode (str)
		# n - amount to shift by (int)
# output: the encoded string
# assumptions: There can be non-alphabet characters. You must leave these alone
			#  Should be able to accommodate upper and lower case letters
			#  0 < n < 26
# restrictions:  DO NOT USE A DICTIONARY OR LIST TO ENCODE YOUR LETTERS
def shift_cipher_encode(string, n):
	# creates a new blank string to store final answer
	new_string = ""
	#for loops lets us look at each character in the string individually.
	for x in range(len(string)):
		#we have two cases. One for when the char is a letter and one where it isn't
		if string[x].isalpha():
			# if its an upper case letter we can subtract 65 from the ascii code to figure out where in the alphabet that letter is at
			if string[x].isupper():
				new_ascii = ord(string[x]) - 65
				new_ascii = (new_ascii + n) % 26
				#we add 65 back after we figure out what letter in the alphabet we need to get the ascii code for the new letter
				new_ascii += 65
				new_char = chr(new_ascii)
				new_string += new_char
			else:
				# if its an lower case letter we can subtract 97 from the ascii code to figure out where in the alphabet that letter is at. uses same process as above
				new_ascii = ord(string[x]) - 97
				new_ascii = (new_ascii + n) % 26
				new_ascii += 97
				new_char = chr(new_ascii)
				new_string += new_char
		else:
			new_string += string[x]
	return new_string



# test
# function name: shift_cipher_decode
# inputs: string - string to decode (str)
		# n - amount to shift by (int)
# output: the decoded string
# assumptions: There can be non-alphabet characters. You must leave these alone
			#  Should be able to accommodate upper and lower case letters
			#  0 < n < 26
# restrictions:  DO NOT USE A DICTIONARY OR LIST TO ENCODE YOUR LETTERS
def shift_cipher_decode(string, n):
	#works exactly like encode except we subtract n instead of adding it to get our ascii code for the new character
	new_string = ""
	for x in range(len(string)):
		if string[x].isalpha():
			if string[x].isupper():
				new_ascii = ord(string[x]) - 65
				new_ascii = (new_ascii - n) % 26
				new_ascii += 65
				new_char = chr(new_ascii)
				new_string += new_char
			else:
				new_ascii = ord(string[x]) - 97
				new_ascii = (new_ascii - n) % 26
				new_ascii += 97
				new_char = chr(new_ascii)
				new_string += new_char
		else:
			new_string += string[x]
	return new_string
	pass






