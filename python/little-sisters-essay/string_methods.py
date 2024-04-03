"""Functions to help edit essay homework using string manipulation."""

def capitalize_title(title):
    title_capi = title.title()
    return title_capi

def check_sentence_ending(sentence):
    sentence_ends = sentence.endswith('.')
    return sentence_ends

def clean_up_spacing(sentence):
    clean_space = sentence.strip()
    return clean_space

def replace_word_choice(sentence, old_word, new_word):
    replace_new = sentence.replace(old_word, new_word)
    return replace_new