from html2json import collect
import json
import requests
import json

# opening json file
f = open("data/1.json")
# returns JSON object as a dictionary
data = json.load(f)
print(data.keys())
# iterating thorugh the json list
# if nested dictionary tag, key == <"some string of interest"
# then iterate through contents of that dictionary. 
for entry in data['tags']:
    for k,v in entry.items():
        print(k,v)
    # if entry['name'] == "pre":
    #     for k,v in entry.items():
    #         print(k,v)
    # elif entry['name'] == "code":
    #     for k,v in entry.items():
    #         print(k,v)
    # elif entry['name'] == "strong":
    #     for k,v in entry.items():
    #         print(k,v)
    # if entry['name'] == "div":
    #     for k,v in entry.items():
    #         print(k,v)
