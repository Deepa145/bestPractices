package com.chainsys.bestpractices.abstractDemo;

public interface Ispelling {
void spellCheck(String word); // must be implemented by all languages
void CheckGrammer(String sentence); // must be implemented by all languages
int wordCount(String sentence); // the logic is the same for all language
}
class EnglishLanguage implements Ispelling
{

	@Override
	public void spellCheck(String word) {
		// TODO Auto-generated method stub
		System.out.println("English Spell Checker");
	}

	@Override
	public void CheckGrammer(String sentence) {
		// TODO Auto-generated method stub
		System.out.println("English Grammer Checker");
	}

	@Override
	public int wordCount(String sentence) {
		// TODO Auto-generated method stub
		return 0;
	}
}
