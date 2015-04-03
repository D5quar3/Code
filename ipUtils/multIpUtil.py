#! /usr/bin/python2.7

import os
from ipUtil import *

class multIpUtil:
    def __init__(self, iplist):
        self.iplist = iplist

    def multStatus(self):
        ipStatus = {}
        for ip in self.iplist:
            a = ipUtil(ip)
            a.scan()
            ipStatus[ip] = a.connected()
        return  ipStatus
