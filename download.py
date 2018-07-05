import urllib.request as request
import urllib.parse as parse
import string
import re
import os
import urllib.error as error
 
def baidu_zhihu(url):
    count=0
    m = request.urlopen(url).read()  
    dirpath = 'D:/python_data/'
    dirname = 'question/35874887'
    new_path = os.path.join(dirpath, dirname)
    if not os.path.isdir(new_path):
        os.makedirs(new_path)
    page_data = m.decode('gbk','ignore')
    print (page_data)
    page_image = re.compile('<img src=\"(.+?)\"')
    for image in page_image.findall(page_data):
        pattern = re.compile(r'^https://.*.jpg$')
        if  pattern.match(image):
            print (image)
            try:
                image_data = request.urlopen(image).read()
                image_path = dirpath + dirname +'/'+str(count)+'.jpg'
                count += 1
                print(image_path)
                with open(image_path, 'wb') as image_file:
                    image_file.write(image_data)
                    image_file.close()
            except error.URLError as e:
                print('Download failed')
if __name__ == "__main__":
    url = "http://www.zhihu.com/question/34243513"
 
    baidu_zhihu(url)