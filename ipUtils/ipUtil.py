#! /usr/bin/python2.7

import os
import re

class ipUtil:
    def __init__(self, ip):
        self.ip = ip
    
    def scan(self):
        open('pingResults.txt', 'w').close
        os.system('nmap -sn -oG pingResults.txt  '+ self.ip)
           
    def connected(self):
        pat = re.compile('Status: Up')
        resfile = open('pingResults.txt', 'r')
        found = False
        for line in resfile:
            con = pat.search(line)
            if con:
                found = True
        if found:
            return "ONLINE"
        else:
            return "OFFLINE"
