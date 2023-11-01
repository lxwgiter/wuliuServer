<template>
  <div class="search-container">
    <div class="search-bar">
      <el-input v-model="searchText" placeholder="请输入搜索内容"></el-input>
      <el-button type="primary" @click="search">查询</el-button>
    </div>

    <div class="search-results" v-if="searchedData.length > 0">
      <h3>查询结果：</h3>
      <ul>
        <li v-for="result in searchedData" :key="result.id">厂商id:{{ result.id }}  厂商姓名:{{ result.supplierName }}  描述:{{ result.des }} 创建时间:{{ result.createTime }}  部门id:{{ result.adminId }}</li>
      </ul>
    </div>
    <div class="no-results" v-else>
      <p>暂无结果</p>
    </div>
  </div>
</template>

<script>
import {getSupplier} from '@/api/search'
export default {
  data() {
    return {
      searchText: '',
      searchedData: [],
    };
  },
  methods: {
    async search() {
      var myData = await getSupplier(this.searchText);
      myData=myData.data;
      console.log(myData);
      if(Array.isArray(myData)){
        this.searchedData=myData;
      }else if(myData===undefined || myData===''){
        this.searchedData=[];
      }else {
        this.searchedData=[myData]
      }

    },
  },
};
</script>

<style scoped>
.search-container {
  display: flex;
  flex-direction: column;
  align-items: center;
}

.search-bar {
  display: flex;
  justify-content: center;
  margin-bottom: 20px;
}

.search-results {
  margin-top: 20px;
}

.no-results {
  margin-top: 20px;
}
</style>
