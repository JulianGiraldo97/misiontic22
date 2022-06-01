import requests
import bs4 as bs
url = 'https://www.nytimes.com/'
res = requests.get(url)
soup = bs.BeautifulSoup(res.text, 'lxml')

def scrap():
    nytitles = []
    for titles in soup.find_all('h3', class_='indicate-hover'):
        nytitles.append(titles.text)

    return nytitles

open_file = open('nytimes.txt', 'w')
articles = scrap()
for article in articles:
    open_file.write(article + '\n')
open_file.close()

